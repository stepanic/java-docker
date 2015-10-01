FROM java:8
ADD thorp.jar .
WORKDIR .
ENTRYPOINT ["java","-jar","thorp.jar"]
CMD [""]
