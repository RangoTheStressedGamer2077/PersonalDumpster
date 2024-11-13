const axios = require('axios');
makeGetRequest = require('./get_users');

async function makePostRequest() {

    params = {
        id: 8,
        first_name: 'Xaxiry',
        last_name: 'Gonzales',
        email: 'MaggyGalez@gmail.com'
      };

    let res = await axios.post("http://localhost:3000/users/", params);

    console.log(res.data);
}

makeGetRequest();

makePostRequest();

makeGetRequest();

