def _import ( ) :
    import sys
    import termios
    import struct
    import struct
    import sys
    import termios
    import sys
    import struct
    import sys
    import sys
    from .utils import get_text_text , get_text_text , get_regex
    class Main ( object ) :
        def __init__ ( self , f , stdin = None , stdout = None , stderr = None ) :
            self.stdin = stdin
            self.stdout = stdout
            self.qq = sys.maxsize
            for casenum in range ( 1 , qq + 1 ) :
                s = read_token ( )
                ret = len ( s ) - 1
                for ch in ( 'a' , 'z' ) :
                    if s.find ( ch ) == - 1 :
                        continue
                    curr = s
                    ans = 0
                    while not valid ( curr ) :
                        parts = [ ]
                        for i in range ( len ( curr ) - 1 ) :
                            if curr [ i ] == ch or curr [ i + 1 ] == ch :
                                parts.append ( ch )
                            else :
                                parts.append ( '?' )
                        curr = ''.join ( parts )
                        ans += 1
                    ret = min ( ret , ans )
                self.stdout.write ( ret )
            self.exit_immediately ( )
        def valid ( s ) :
            for i in range ( len ( s ) ) :
                if s [ i ] != s [ 0 ] :
                    return False
            return True
        def exit_immediately ( self ) :
            self.stdout.close ( )
            sys.exit ( 0 )
        def readLong ( self ) :
            return long ( self.read_token ( ) )
        def readdouble ( self ) :
            return float ( self.read_token ( ) )
        def readInt ( self ) :
            return int ( self.read_token ( ) )
        def readline ( self ) :
            s = self.stdin.readline ( )
            if not s :
                self.exit_immediately ( )
            s = None
            return s
        def readtoken ( self ) :
            while not s or not s :
                s = read_token ( )
            return s
    return Main ( )
