<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<head>
    <title>Home</title>
    <link rel="stylesheet" href="./css/home.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css"
          integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
</head>

<body>

<nav>

    <div class="left">

        <div class="logo">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Facebook_Logo_%282019%29.png/1200px-Facebook_Logo_%282019%29.png"
                 alt="Facebook">
        </div>

        <div class="search_bar">

            <i class="fa-solid fa-magnifying-glass"></i>
            <input type="text" placeholder="Search EBook">

        </div>

    </div>

    <div class="center">

        <i class="fa-solid fa-house"></i>
        <i class="fa-solid fa-tv"></i>
        <i class="fa-solid fa-store"></i>
        <i class="fa-solid fa-users"></i>

    </div>

    <div class="right">

        <i class="fa-solid fa-list-ul"></i>
        <i class="fa-brands fa-facebook-messenger"></i>
        <i class="fa-solid fa-bell"></i>
        <i class="fa-solid fa-moon"></i>
        <img src="./image/profile.png">

    </div>

</nav>


<!------------main--------------->

<div class="main">

    <!------------------left------------------->

    <div class="left">

        <div class="img">
            <img src="./image/profile.png">
            <p>John Deo</p>
        </div>

        <div class="img">
            <img src="./image/friend.png">
            <p>Friends</p>
        </div>

        <div class="img">
            <img src="./image/saved.png">
            <p>Saved</p>
        </div>

        <div class="img">
            <img src="./image/group.png">
            <p>Groups</p>
        </div>

        <div class="img">
            <img src="./image/marketplace.png">
            <p>Marketplace</p>
        </div>

        <div class="img">
            <img src="./image/watch.png">
            <p>Watch</p>
        </div>

        <div class="img">
            <img src="./image/down_arrow.png">
            <p>See more</p>
        </div>

        <hr>

        <h2>You shortcuts</h2>
        <p class="edit">Edit</p>

        <div class="shortcuts">
            <img src="./image/shortcuts_1.png">
            <p>MOBILE GAMES</p>
        </div>

        <div class="shortcuts">
            <img src="./image/down_arrow.png">
            <p>See more</p>
        </div>

    </div>

    <!------------center---------------------->

    <div class="center">

        <div class="my_post">

            <div class="post_top">

                <img src="./image/profile.png">
                <input type="text" placeholder="What's on you mind, John?">

            </div>

            <hr>

            <div class="post_bottom">

                <div class="post_icon">
                    <i class="fa-solid fa-video red"></i>
                    <p>Live video</p>
                </div>

                <div class="post_icon">
                    <i class="fa-solid fa-images green"></i>
                    <p>Photo/video</p>
                </div>

                <div class="post_icon">
                    <i class="fa-regular fa-face-grin yellow"></i>
                    <p>Feeling/activity</p>
                </div>

            </div>

        </div>

        <div class="friends_post">

            <div class="friend_post_top">

                <div class="img_and_name">

                    <img src="./image/post_1.jpg">

                    <div class="friends_name">
                        <p class="friends_name">
                            Senuda De Silva
                        </p>
                        <p class="time">16h.<i class="fa-solid fa-user-group"></i></p>
                    </div>


                </div>

                <div class="menu">

                    <i class="fa-solid fa-ellipsis"></i>

                </div>

            </div>

            <img src="./image/post_1.jpg">

            <div class="info">

                <div class="emoji_img">
                    <img src="./image/like.png">
                    <img src="./image/haha.png">
                    <img src="./image/heart.png">
                    <p>You, Charith Disanayaka and 25K others</p>
                </div>

                <div class="comment">
                    <p>421 Comments</p>
                    <p>1.3K Shares</p>
                </div>

            </div>

            <hr>

            <div class="like">

                <div class="like_icon">
                    <i class="fa-solid fa-thumbs-up activi"></i>
                    <p>Like</p>
                </div>

                <div class="like_icon">
                    <i class="fa-solid fa-message"></i>
                    <p>Comments</p>
                </div>

                <div class="like_icon">
                    <i class="fa-solid fa-share"></i>
                    <p>Share</p>
                </div>

            </div>

            <hr>

            <div class="comment_warpper">

                <img src="./image/profile.png">
                <div class="circle"></div>

                <div class="comment_search">

                    <input type="text" placeholder="Write a comment">
                    <i class="fa-regular fa-face-smile"></i>
                    <i class="fa-solid fa-camera"></i>
                    <i class="fa-regular fa-note-sticky"></i>

                </div>

            </div>

        </div>

        <div class="load">
            <button>Load More</button>
        </div>

    </div>

    <!------------------right------------------>

    <div class="right">

        <div class="second_warpper">

            <h2>Birthdays</h2>

            <div class="img_and_tag">

                <img src="./image/gift.png">
                <p><span>Senuda De Silva </span>and<span> 2 others </span>have birthdays today</p>

            </div>

        </div>

        <hr>


        <div class="third_warpper">

            <div class="contact_tag">

                <h2>Contacts</h2>

                <div class="contact_icon">

                    <i class="fa-solid fa-video"></i>
                    <i class="fa-solid fa-magnifying-glass"></i>
                    <i class="fa-solid fa-ellipsis"></i>

                </div>

            </div>

            <div class="contact">

                <img src="./image/contact_1.jpg">
                <p>Senuda De Silva</p>

            </div>

        </div>

    </div>

</div>


</body>

</html>