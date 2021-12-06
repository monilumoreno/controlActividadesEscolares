import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';

const Menu = () => {
	return (
		<Fragment>
			<div className="menu">
				<div className="menu-profile">
					<Link to="#" className="menu-profile-link" data-toggle="app-sidebar-profile" data-target="#appSidebarProfileMenu">						<div className="menu-profile-cover with-shadow"></div>
						<div class="menu-profile-image">
							<img src="../assets/img/user/docente.png"  width="100px" alt="Docente" />
						</div>
						<div className="menu-profile-info">
							<div className="d-flex align-items-center">
								<div className="flex-grow-1">
									Docente
								</div>
								<div className="menu-caret ms-auto"></div>
							</div>							
						</div>
					</Link>
				</div>				
				<div className="menu-header">Navegación</div>
				<div className="menu-item active">
					<Link to="/homedocente" className="menu-link">
						<div className="menu-icon">
							<i className="fa fa-th-large"></i>
						</div>
						<div className="menu-text">Inicio</div>
					</Link>
				</div>				
				<div className="menu-item has-sub">
					<Link to="#" className="menu-link">
						<div className="menu-icon">
							<i className="fa fa-align-left"></i>
						</div>
						<div className="menu-text">Cursos</div>
						<div className="menu-caret"></div>
					</Link>
					<div className="menu-submenu">						
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Registrar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Modificar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Listar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Eliminar</div></Link></div>
					</div>
					<Link to="#" className="menu-link">
						<div className="menu-icon">
							<i className="fa fa-align-left"></i>
						</div>
						<div className="menu-text">Materias</div>
						<div className="menu-caret"></div>
					</Link>
					<div className="menu-submenu">						
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Registrar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Modificar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Listar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Eliminar</div></Link></div>
					</div>
					<Link to="#" className="menu-link">
						<div className="menu-icon">
							<i className="fa fa-align-left"></i>
						</div>
						<div className="menu-text">Docentes</div>
						<div className="menu-caret"></div>
					</Link>
					<div className="menu-submenu">						
						<div className="menu-item"><Link to="/docente-create" className="menu-link"><div className="menu-text">Registrar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Modificar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Listar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Eliminar</div></Link></div>
					</div>
					<Link to="#" className="menu-link">
						<div className="menu-icon">
							<i className="fa fa-align-left"></i>
						</div>
						<div className="menu-text">Alumnos</div>
						<div className="menu-caret"></div>
					</Link>
					<div className="menu-submenu">						
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Registrar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Modificar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Listar</div></Link></div>
						<div className="menu-item"><Link to="#" className="menu-link"><div className="menu-text">Eliminar</div></Link></div>
					</div>
				</div>				
				<div className="menu-item d-flex">
					<Link to="#" className="app-sidebar-minify-btn ms-auto" data-toggle="app-sidebar-minify"><i className="fa fa-angle-double-left"></i></Link>
				</div>
			</div>
		</Fragment>
	);
}

export default Menu;
