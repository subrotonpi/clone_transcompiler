def main ( ) :
    import sys
    io = open ( sys.argv [ 1 ] , 'r' )
    S = io.read ( )
    ans = 0
    for i , c in enumerate ( S ) :
        if c == 'U' :
            ans += ( ( len ( S ) - 1 ) - i ) + i * 2
        else :
            ans += ( ( len ( S ) - 1 ) - i ) * 2 + i
    print ( ans )
