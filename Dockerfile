FROM ubuntu:22.04

RUN apt-get update -qq
RUN apt-get install -y curl nginx

COPY start.sh /
RUN chmod +x /start.sh
ENV COLOR=gray
ENV TITLE="use COLOR/TITLE env vars"

EXPOSE 80

CMD [ "/start.sh" ]