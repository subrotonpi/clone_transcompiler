def _import ( ) :
    from time import time
    from os import system , getcwd
    from os.path import join
    from os import getcwd
    from os import listdir
    class C :
        def solve ( self ) :
            pattern = 'welcome to code jam'.split ( )
            pattern_n = len ( pattern )
            MODULO = 10000
            line = raw_input ( ).split ( '\n' )
            d = [ 1 ]
            for c in line :
                for i in range ( pattern_n - 1 , - 1 , - 1 ) :
                    if c == pattern [ i ] :
                        d [ i + 1 ] += d [ i ]
                        d [ i + 1 ] %= MODULO
            answer = sum ( d )
            while len ( answer ) < 4 :
                answer = '0' + answer
            out.write ( ' ' * ( 4 - len ( d ) ) + '\n' )
            out.write ( answer )
    def f ( ) :
        try :
            return open ( join ( getcwd ( ) , '..' ) , 'r' ).readline ( )
        except IOError :
            raise IOError ( )
    def readline ( ) :
        try :
            return raw_input ( ).split ( '\n' ) [ 0 ]
        except IOError :
            raise IOError ( )
    def estimate_time_left ( tc , t_count , time_start ) :
        time = time ( )
        time_per_test = ( 1.0 * ( time - time_start ) ) / tc
        return int ( time_per_test * ( t_count - tc ) / 1000.0 )
    def solve ( infile ) :
        time_start = time ( )
        with open ( infile ) as infile :
            out = open ( infile + '.out' , 'w' )
    def f ( ) :
        out.write ( 'Solving test case #%d/%d' % ( tc + 1 , t_count ) )
        if tc > 0 :
            print ( ', estimated time left: %d sec' % ( t_count , time_start ) , end = ' ' )
    print ( )
    print ( 'Case #%d:' % ( tc + 1 ) , end = ' ' )
