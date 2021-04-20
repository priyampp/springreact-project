import React from 'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data})
        });
    }

    render (){
        return (
            <div>
                <h2 className = "text-center"> Employee Details</h2>
            
        <table className = "table table-striped table-bordered">
                    <thead>
                        <tr>
                            
                            <td><h6> Employee Id</h6></td>
                            <td> <h6>Name</h6></td>
                            <td> <h6>Department</h6></td>
                            <td><h6> Email</h6></td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user => 
                                <tr key = {user.id}>
                                     <td> {user.id}</td>   
                                     <td> {user.firstName}</td>   
                                     <td> {user.department}</td> 
                                     <td> {user.email}</td>  
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default UserComponent