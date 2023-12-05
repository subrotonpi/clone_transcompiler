def Main ( ) :
    global x
    n , x = raw_input ( ) , 1
    depth = len ( str ( int ( n ) ) ) & 1
    turn = False
    while n >= x :
        x = x * 2 + ( ( 1 - depth ) if ( not turn ) else depth )
    print ( "Aoki" if turn else "Takahashi" )
