import React from "react";
import p1 from '../Imgs/p1.jpg';
import p2 from '../Imgs/p2.jpg';
import p3 from '../Imgs/p3.jpg';

const Home = () => {

    return (
        <>
            <div className="container" style={{marginTop:"20px"}}>
                <div id="carouselExampleCaptions" className="carousel slide" data-ride="carousel">
                    <ol className="carousel-indicators">
                        <li data-target="#carouselExampleCaptions" data-slide-to="0" className="active"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                    </ol>
                    <div className="carousel-inner">
                        <div className="carousel-item active">
                            <img src={p1} className="d-block w-100" alt="..."/>
                                <div className="carousel-caption d-none d-md-block">
                                    <h5>Hello EveryOne </h5>
                                    <p>Welcom to the wildlife photography.</p>
                                </div>
                        </div>
                        <div className="carousel-item">
                            <img src={p2} className="d-block w-100" alt="..."/>
                                <div className="carousel-caption d-none d-md-block">
                                    <h5>You time is precious </h5>
                                    <p>Please,Don't waste it for others like always thinking about others.,</p>
                                </div>
                        </div>
                        <div className="carousel-item">
                            <img src={p3} className="d-block w-100" alt="..."/>
                                <div className="carousel-caption d-none d-md-block">
                                    <h5>Life Lessons </h5>
                                    <p>Life is not only about winning.</p>
                                </div>
                        </div>
                    </div>
                    <button className="carousel-control-prev" type="button" data-target="#carouselExampleCaptions" data-slide="prev">
                        <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span className="sr-only">Previous</span>
                    </button>
                    <button className="carousel-control-next" type="button" data-target="#carouselExampleCaptions" data-slide="next">
                        <span className="carousel-control-next-icon" aria-hidden="true"></span>
                        <span className="sr-only">Next</span>
                    </button>
                </div>
            </div>
        </>
    )
}

export default Home;