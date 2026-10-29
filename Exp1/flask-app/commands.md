cd flask-app 

pip3 install -r requirements.txt

docker build --no-cache -t flask-app

docker run -p 5000:5000 flask-app


web browser:

https://localhost:/5000/register
