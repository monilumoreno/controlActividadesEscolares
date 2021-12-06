import React, {Fragment} from 'react';
import { Link } from 'react-router-dom';

const Header = () => {
    return ( 
        <Fragment>
            <div id="header" className="app-header">
				<div className="navbar-header">
					<Link to="/" className="navbar-brand">
						<img src="../assets/img/logo/logoControl.jpg" alt="Control de Actividades Escolares" width="" height="" />
						<span className="navbar-brand mb-0 h1"><b>Control Actividades Escolares</b></span>												
					</Link>
					<button type="button" className="navbar-mobile-toggler" data-toggle="app-sidebar-mobile">
						<span className="icon-bar"></span>
						<span className="icon-bar"></span>
						<span className="icon-bar"></span>
					</button>
				</div>
				<div className="navbar-nav">
					<div className="navbar-item navbar-user dropdown">
						<Link to="#" className="navbar-link dropdown-toggle d-flex align-items-center" data-bs-toggle="dropdown">
							<img src="../assets/img/user/docente.png" alt="" /> 							
							<span className="d-none d-md-inline"></span> <b className="caret ms-10px"></b>
						</Link>
						<div className="dropdown-menu dropdown-menu-end me-1">
							<Link to="#" className="dropdown-item">Editar Perfil</Link>						
							<div className="dropdown-divider"></div>
							<Link to="/" className="dropdown-item">Cerrar sesión</Link>
						</div>
					</div>
				</div>
		    </div>
        </Fragment>
    );
}
 
export default Header;
