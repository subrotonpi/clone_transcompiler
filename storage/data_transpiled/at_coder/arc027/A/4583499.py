def main ( ) :
    import sys
    from time import sleep
    from os.path import join
    from os import sep
    from os import path
    h = int ( join ( sys.argv [ 1 : ] , '..' ) )
    m = int ( join ( sys.argv [ 1 : ] , '..' ) )
    ans = 0
    if h < 17 :
        if m == 0 :
            ans = ( 18 - h ) * 60
        else :
            ans = ( ( 17 - h ) * 60 ) + ( 60 - m )
    else :
        ans = 60 - m
    print ( ans )
