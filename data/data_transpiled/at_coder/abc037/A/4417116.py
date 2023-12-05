def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import sin , cos , log
    from math import log
    shiro = int ( sys.stdin.read ( ) )
    green = int ( sys.stdin.read ( ) )
    money = int ( sys.stdin.read ( ) )
    waru_a = money / shiro
    waru_b = money / green
    waruans = 0
    if waru_a > waru_b :
        waruans = waru_a
    else :
        waruans = waru_b
    print ( waruans )
