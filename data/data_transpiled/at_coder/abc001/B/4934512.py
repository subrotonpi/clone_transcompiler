def main ( ) :
    from sys import stdin
    q_2 ( )
    def q_1 ( ) :
        with stdin :
            h1 = stdin.readline ( ).strip ( )
            h2 = stdin.readline ( ).strip ( )
            print ( h1 - h2 )
    def q_2 ( ) :
        with stdin :
            m = stdin.readline ( ).strip ( )
            if m < 100 :
                print ( '00' )
            elif 100 <= m <= 5000 :
                print ( '%02d' % ( ( m * 10 ) // 1000 ) )
            elif 6000 <= m <= 30000 :
                print ( '%02d' % ( ( m // 1000 ) + 50 ) )
            elif 35000 <= m <= 70000 :
                print ( '%02d' % ( ( ( m // 1000 ) - 30 ) // 5 + 80 ) )
            elif m > 70000 :
                print ( 89 )
