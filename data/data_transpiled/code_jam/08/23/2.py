def _import ( ) :
    from os import popen
    from os import environ
    from os import environ
    from os import environ
    from os import chdir
    from locale import getpreferredencoding
    class C :
        NAME = 'c-large'
        def __init__ ( self ) :
            self.NAME = environ [ 'NAME' ]
            self.K = 32
        def calc ( v ) :
            cards = K
            for i in range ( 1 , K + 1 ) :
                j = ( ( i - 1 ) % cards ) + 1
                if j == v :
                    return i
                if j < v :
                    v -= j
                else :
                    v = cards + v - j
                cards -= 1
            return 0
        def solve ( self ) :
            ntest = int ( self.read_word ( ) )
            for test in range ( 1 , ntest + 1 ) :
                stdout.write ( 'Case #%d:' % test )
                K , n = [ int ( i ) for i in self.read_word ( ) ]
                for i in range ( n ) :
                    v = int ( self.read_word ( ) )
                    stdout.write ( ' %s' % calc ( v ) )
                stdout.write ( '\n' )
    class ReadWord ( ) :
        b = [ ]
        while 1 :
            c = stdin.read ( 1 )
            if c < 0 :
                return ''
            if c > 32 :
                break
        while 1 :
            b.append ( chr ( c ) )
            c = stdin.read ( 1 )
            if c <= 32 :
                break
        return b
    def run ( self ) :
        try :
            stdin = open ( self.NAME + '.in' , 'r' )
            stdout = open ( self.NAME + '.out' , 'w' )
            solve ( self )
            stdout.close ( )
            stdin.close ( )
        except :
            pass
    def main ( self ) :
        try :
            locale.setlocale ( locale.LC_ALL , '' )
        except :
            pass
        reactor.callLater ( run , self.NAME , main )
    return main
