def main ( ) :
    import sys
    from os import urandom
    from os import fdopen
    from os import urandom
    from os.path import join
    from os import urandom
    from os.path import join
    class B ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( join ( self.stdin , 'stdin' ) , 'w' )
            self.stdout = sys.stdout
        def solve ( self ) :
            n , k , b , t = [ int ( i ) for i in self.readword ( ).split ( '' ) ]
            x = [ int ( i ) for i in self.x ]
            v = [ int ( i ) for i in self.v ]
            count = 0
            answer = 0
            for i in range ( n - 1 , - 1 , - 1 ) :
                if count == k : break
                if b - x [ i ] <= v [ i ] * t :
                    answer += n - i - 1 - count
                    count += 1
            if count != k :
                self.stdout.write ( 'IMPOSSIBLE\n' )
            else :
                self.stdout.write ( str ( answer ) + '\n' )
        def readword ( self ) :
            c = self.stdin.read ( )
            while c >= 0 and c <= '' : c = c - 1
            if not c : return ''
            bld = [ ]
            while c > '' :
                bld.append ( chr ( c ) )
                c = self.stdin.read ( )
            return bld
        def run ( self ) :
            try :
                self.stdin = open ( join ( self.stdout , 'stdin' ) , 'r' )
                self.stdout = open ( join ( self.stdout , 'stdout' ) , 'w' )
                self.stderr = open ( join ( self.stdout , 'w' ) , 'w' )
                self.tn = int ( self.readword ( ) )
                for i in range ( self.tn ) :
                    self.stdout.write ( 'Case #%d: ' % ( i + 1 ) )
                    self.solve ( )
            except :
                sys.exit ( 1 )
