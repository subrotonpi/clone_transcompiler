def main ( ) :
    import sys
    from time import sleep
    x = sleep ( 1 )
    ans = 0
    ans = ( x / 11 ) * 2
    if x % 11 == 0 :
        pass
    elif x % 11 < 7 :
        ans = ans + 1
    else :
        ans = ans + 2
    sys.stdout.write ( ans )
