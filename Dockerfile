FROM ubuntu

RUN apt-get update -qq
RUN apt-get install -y curl nginx

RUN echo 'orokelet ...' > /var/www/html/index.html
CMD [ "nginx", "-g", "daemon off;" ]
