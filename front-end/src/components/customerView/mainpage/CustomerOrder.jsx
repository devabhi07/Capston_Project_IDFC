import { Grid, Typography } from '@material-ui/core';
import React from 'react';
import OrderCard from "../../card/OrderCard";
const axios = require('axios').default;

class CustomerOrder extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      orders: undefined
    }
    this.getActiveOrders = this.getActiveOrders.bind(this);
  }

  componentDidMount() {
    this.getActiveOrders();
  }

  getActiveOrders() {
    axios.get("/api/customer/myActiveOrders/" + this.props.currentUser.id).then(
      response => {
        this.setState({orders: response.data});
      }
    ).catch(err => console.log(err));
  }

  render() {
    return this.props.currentUser && this.state.orders ? (
      <div>
        <Grid container justify="space-evenly" spacing={3}>
          {this.state.orders.length > 0 ? this.state.orders.map(order => (
            <Grid item key={order.id} xs={5}>
              <OrderCard order={order} userType={this.props.currentUser.type} getOrders={this.getActiveOrders} />
            </Grid>
          )) : <Typography variant="h5"><img className="image" alt="foodImage" src='https://img.freepik.com/free-vector/shopping-cart_1284-672.jpg?w=740&t=st=1669641349~exp=1669641949~hmac=977ca2b2e520d9df4324c42928a44f64766d82d11914469e8f802b64cd93e41b' /></Typography>}
        </Grid>
      </div>
    ) : <div />
  }
}

export default CustomerOrder;