def main ( ) :
    import sys
    from itertools import repeat
    n = sys.stdin.read ( )
    ans = 0
    for i in repeat ( 1 , n ) :
        ans += i
    print ( ans )
