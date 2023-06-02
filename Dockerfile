FROM openjdk:latest
COPY out/production/GBJavaCore/ /tmp
WORKDIR /tmp
CMD java coreHw1.Main