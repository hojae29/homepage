document.querySelector('.main_nav').addEventListener('mouseenter', function() {
    let sub = document.querySelector('.sub_nav_layout');
    let scrollHeight = sub.scrollHeight;
    sub.style.height = scrollHeight + 'px';
});

document.querySelector('header').addEventListener('mouseleave', function() {
    let sub = document.querySelector('.sub_nav_layout');
    sub.style.height = '0px';
});