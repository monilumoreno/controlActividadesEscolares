import React, { Fragment } from 'react';
import { Link } from 'react-router-dom';

const Login = () => {
    return (
        <Fragment>
			{/*
            <div id="loader" className="app-loader">
		        <span className="spinner"></span>
	        </div>
			*/}
	    	<div id="app" className="app">
				<div className="login login-with-news-feed">
        			<div className="news-feed">
				        <div className="news-image" style={{backgroundImage: "url(../assets/img/login-bg/pizarra2.png)"}}></div>
				            <div className="news-caption">
					            {/* <h4 className="caption-title"><b>Control de Actividades Escolares</b> App</h4> */}
					            <p>
									La aplicación que acerca el acudiente al entorno escolar y a revisar el cumplimiento de las actividades escolares.
					            </p>
				            </div>
			            </div>
						<div className="login-container">
							<div className="login-header mb-30px">
								<div className="brand">
						            <div className="d-flex align-items-center">
							            <img src="../assets/img/logo/logoControl.jpg" alt="Control de Actividades Escolares" width="'84px" height="80px" /> &nbsp; &nbsp;						            
										<h4>Control de Actividades Escolares</h4>
									</div>
								</div>
					        <div className="icon" >
						        <i className="fa fa-sign-in-alt"></i>
					        </div>
				        </div>
						<div className="login-content">
					        <form className="fs-13px">
						        <div className="form-floating mb-15px">
							        <input type="text" className="form-control h-45px fs-13px" placeholder="Usuario" id="usuario" required />
							        <label htmlFor="usuario" className="d-flex align-items-center fs-13px text-gray-600">Usuario</label>									
						        </div>
						        <div className="form-floating mb-15px">
							        <input type="password" className="form-control h-45px fs-13px" placeholder="Contraseña" id="password" required />
							        <label htmlFor="password" className="d-flex align-items-center fs-13px text-gray-600">Contraseña</label>					
						        </div>
						        <div className="form-check mb-30px">
							        <input className="form-check-input" type="checkbox" value="1" id="rememberMe" />
							        <label className="form-check-label" for="rememberMe">
								        Recordar
							        </label>
						        </div>
						        <div className="mb-15px">
							        <Link to="/homeadmin" className="btn btn-success d-block h-45px w-100 btn-lg fs-14px">Entrar</Link>
						        </div>
								<hr className="bg-gray-600 opacity-2" />
						        <div className="text-gray-600 text-center text-gray-500-darker mb-0">
							        &copy; Color Admin All Right Reserved 2021
						        </div>
					        </form>
				        </div>				
        			</div>
		        </div>
				{ /*
                <div className="theme-panel">
                    <Link to="#" data-toggle="theme-panel-expand" className="theme-collapse-btn"><i className="fa fa-cog"></i></Link>
                    <div className="theme-panel-content" data-scrollbar="true" data-height="100%">
                        <h5>App Settings</h5>
                        <div className="theme-list">
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-red" data-theme="red" data-theme-file="../assets/css/default/theme/red.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Red">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-pink" data-theme="pink" data-theme-file="../assets/css/default/theme/pink.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Pink">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-orange" data-theme="orange" data-theme-file="../assets/css/default/theme/orange.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Orange">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-yellow" data-theme="yellow" data-theme-file="../assets/css/default/theme/yellow.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Yellow">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-lime" data-theme="lime" data-theme-file="../assets/css/default/theme/lime.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Lime">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-green" data-theme="green" data-theme-file="../assets/css/default/theme/green.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Green">&nbsp;</Link></div>
                            <div className="theme-list-item active"><Link to="#" className="theme-list-link bg-teal" data-theme="default" data-theme-file="" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Default">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-cyan" data-theme="cyan" data-theme-file="../assets/css/default/theme/cyan.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Cyan">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-blue" data-theme="blue" data-theme-file="../assets/css/default/theme/blue.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Blue">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-purple" data-theme="purple" data-theme-file="../assets/css/default/theme/purple.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Purple">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-indigo" data-theme="indigo" data-theme-file="../assets/css/default/theme/indigo.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Indigo">&nbsp;</Link></div>
                            <div className="theme-list-item"><Link to="#" className="theme-list-link bg-black" data-theme="black" data-theme-file="../assets/css/default/theme/black.min.css" data-toggle="theme-selector" data-bs-toggle="tooltip" data-bs-trigger="hover" data-bs-container="body" data-bs-title="Black">&nbsp;</Link></div>
                        </div>
                        <div className="theme-panel-divider"></div>
                        <div className="theme-panel-divider"></div>
                        <Link to="https://seantheme.com/color-admin/documentation/" className="btn btn-inverse d-block w-100 rounded-pill mb-10px" target="_blank"><b>Documentation</b></Link>
                      </div>
                </div>
				*/}
                <Link to="#" className="btn btn-icon btn-circle btn-success btn-scroll-to-top" data-toggle="scroll-to-top"><i className="fa fa-angle-up"></i></Link>
              </div>
        </Fragment>
    );
}

export default Login;