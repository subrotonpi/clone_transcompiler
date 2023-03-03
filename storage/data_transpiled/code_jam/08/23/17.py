def pygliebe.codejam ( ) :
    import os
    import sys
    import os
    import re
    import sys
    import os.path
    import sys
    import os.path
    import re
    class ProblemC ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( sys.argv [ 1 ] , 'r' )
            self.stdout = open ( sys.argv [ 2 ] , 'w' )
            try :
                in_r = sys.stdin.read ( )
                buf = in_r.split ( '\n' )
                n = int ( buf [ 0 ] )
                for i in range ( n ) :
                    self.stdout.write ( 'Case #%d:%s\n' % ( i + 1 , self.calculateCase ( buf ) ) )
            finally :
                in_r.close ( )
        def next ( self , x , A , B , M ) :
            return ( x * A + B ) % M
    p = re.compile ( r'(\d*)\s(\d*)\s(\d*)' )
    def calculateCase ( buf ) :
        K = int ( buf [ 0 ] )
        s = buf [ 1 ] + ' '
        ds = [ ]
        result = ""
        s += ' '
        ix = s.index ( ' ' )
        n = int ( s [ 0 : ix ] )
        for i in range ( n ) :
            s = s [ ix + 1 : ]
            ix = s.index ( ' ' )
            ds.append ( int ( s [ 0 : ix ] ) )
            result += ' ' + calculate ( K , int ( s [ 0 : ix ] ) )
        return result
    def calculate ( k , d ) :
        for i in range ( 1 , k + 1 ) :
            r = k - i + 1
            m = i % r
            if m == 0 :
                m = r
            if m == d :
                d += r
        return d
    return ProblemC
