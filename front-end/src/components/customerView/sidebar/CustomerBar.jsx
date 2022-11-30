import React from "react";
// import FastfoodIcon from '@material-ui/icons/Fastfood';
import HomeIcon from "@material-ui/icons/Home";
import AddShoppingCartIcon from "@material-ui/icons/AddShoppingCart";
// import LocalMallIcon from '@material-ui/icons/LocalMall';

import EnhancedEncryptionSharpIcon from "@material-ui/icons/EnhancedEncryptionSharp";
import YoutubeSearchedForSharpIcon from "@material-ui/icons/YoutubeSearchedForSharp";
import PermIdentitySharpIcon from "@material-ui/icons//PermIdentitySharp";

// import ShoppingCartCheckoutIcon from '@material-ui/icons/ShoppingCartCheckout';

import { Link } from "react-router-dom";
import { List, ListItem, ListItemText, Divider } from "@material-ui/core";

class CustomerBar extends React.Component {
  render() {
    return (
      <div>
        {/* <br />

        <h3>
          <b>
            <PermIdentitySharpIcon />
          </b>
        </h3>
        <br /> */}
        <List component="nav">
          <Link to={"/customer/home"} className="link">
            <ListItem>
              <HomeIcon color="primary" />

              <ListItemText primary={"Home Page"} />
            </ListItem>
            <Divider />
          </Link>
          <Link to={"/customer/cart"} className="link">
            <ListItem>
              <AddShoppingCartIcon color="primary"/>
              <ListItemText primary={"My Shopping Cart"} />
            </ListItem>
            <Divider />
          </Link>
          <Link to={"/customer/orders"} className="link">
            <ListItem>
              <EnhancedEncryptionSharpIcon color="primary"/>
              <ListItemText primary={"My Active Orders"} />
            </ListItem>
            <Divider />
          </Link>
          <Link to={"/customer/history"} className="link">
            <ListItem>
              <YoutubeSearchedForSharpIcon color="primary"/>
              <ListItemText primary={"My Order History"} />
            </ListItem>
            <Divider />
          </Link>
        </List>
      </div>
    );
  }
}

export default CustomerBar;
