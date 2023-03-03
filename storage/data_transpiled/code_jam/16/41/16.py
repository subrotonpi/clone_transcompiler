def main ( ) :
    import sys
    from os import isatty
    from os import urandom
    from os import fdopen
    from os.path import expanduser
    from os.path import join
    def doit ( c , deep = 0 ) :
        if not deep :
            return open ( '%s' % c , 'r' )
        if c == 'S' :
            s1 = doit ( 'P' , deep - 1 )
            s2 = doit ( c , deep - 1 )
            if s1 < s2 :
                return s1 + s2
            else :
                return s2 + s1
        elif c == 'P' :
            s1 = doit ( 'R' , deep - 1 )
            s2 = doit ( c , deep - 1 )
            if s1 < s2 :
                return s1 + s2
            else :
                return s2 + s1
        elif c == 'R' :
            s1 = doit ( 'S' , deep - 1 )
            s2 = doit ( 'P' , deep - 1 )
            if s1 < s2 :
                return s1 + s2
            else :
                return s2 + s1
        return open ( '%s' % c , 'w' )
    def check ( q , r , p , s ) :
        for i in range ( len ( q ) ) :
            if q [ i ] == 'S' :
                s -= 1
            elif q [ i ] == 'R' :
                r -= 1
            elif q [ i ] == 'P' :
                p -= 1
        return ( s == 0 and r == 0 and p == 0 )
    def solve ( ) :
        t = randint ( 1 , t )
        for case in range ( t ) :
            n = randint ( 1 , t )
            r = randint ( 1 , t )
            p = randint ( 1 , t )
            s = randint ( 1 , t )
            q1 = doit ( 'S' , n ) [ 0 ]
            q2 = doit ( 'R' , n ) [ 0 ]
            q3 = doit ( 'P' , n ) [ 0 ]
            res = ''
            if check ( q1 , r , p , s ) :
                res = q1
            if check ( q2 , r , p , s ) :
                if res == '' or res > q2 :