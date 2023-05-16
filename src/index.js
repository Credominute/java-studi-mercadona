var myHeaders = new Headers();
myHeaders.append("Authorization", "bearer token");

var requestOptions = {
  method: 'GET',
  headers: myHeaders,
  redirect: 'follow'
};

fetch("localhost", requestOption)
.then(response => response.json())
.then(result => console.log(result))
.catch(error => console.log('error', error));