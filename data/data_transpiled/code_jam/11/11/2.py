def _import ( stream ) :
    import sys
    import io
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            try :
                sys.stdin = open ( 'a.in' , 'r' )
                sys.stdout = open ( 'a.out' , 'w' )
            except :
                sys.stdin = stream
        def exit ( self , stream ) :
            sys.stdout.write ( '%s\n' % self.test_number )
        def solve ( self , stream ) :
            self.max_gamesToday = stream.read ( )
            percent_today = stream.read ( )
            stream.write ( 'Case #%d: ' % self.test_number )
            if percent_total == 100 or percent_total == 0 :
                if percent_today == percent_total :
                    stream.write ( 'Possible' )
                else :
                    stream.write ( 'Broken' )
                return
            for i in range ( 1 , 100 + 1 ) :
                if percent_today * i % 100 == 0 :
                    stream.write ( 'Possible' )
            for i in range ( 1 , test_count + 1 ) :
                if percent_today * i % 100 == 0 :
                    stream.write ( 'Broken' )
        def run ( self , stream ) :
            solver = TaskA ( )
            test_count = stream.read ( )
            for i in range ( 1 , test_count + 1 ) :
                solver.solve ( i , stream , stream )
            exit ( self , stream )
    class abstract ( io.InputStream ) :
        def __init__ ( self ) :
            self.finished = False
        def read ( self ) :
            c = stream.read ( )
            while is_space_char ( c ) :
                c = stream.read ( )
            sgn = 1
            if c == '-' :
                sgn = - 1
                c = stream.read ( )
            res = 0
            while True :
                if c < '0' or c > '9' :
                    raise InputError ( )
                res *= 10
                res += c - '0'
                c = stream.read ( )
            return res * sgn
        def read ( self , stream ) :
        