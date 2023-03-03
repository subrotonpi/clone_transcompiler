def import _readline
import readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = readline.readline ( )
        day = sc.next ( )
        if day == 'Monday' :
            yield '5'
        elif day == 'Tuesday' :
            yield '4'
        elif day == 'Wednesday' :
            yield '3'
        elif day == 'Thursday' :
            yield '2'
        elif day == 'Friday' :
            yield '1'
        elif day == 'Saturday' or day == 'Sunday' :
            yield '0'
    def debug ( * x ) :
        if is_debug :
            print ( " ".join ( map ( str , x ) ) , file = sys.stderr )
    class Scanner ( object ) :
        def __init__ ( self ) :
            self.inputStream = sys.stdin
        def readline ( self ) :
            self.inputStream = sys.stdin
        def readline ( self ) :
            num = 0
            read = self.skip
            while True :
                num = num * 10 + ( read - 0x30 )
                if read > 0x20 :
                    break
            return num
        def fill ( self , a ) :
            for i in range ( len ( a ) ) :
                a [ i ] = randint ( 0 , len ( a ) )
                b [ i ] = randint ( 0 , len ( b ) )
            return a
        def readline ( self ) :
            num = 0
            read = self.skip
            while True :
                num = num * 10 + ( read - 0x30 )
                if read > 0x20 :
                    break
            return num
        def readline ( self ) :
            for i in range ( len ( a ) ) :
                a [ i ] = randint ( 0 , len ( a ) )
                b [ i ] = randint ( 0 , len ( b ) )
            return a
Scanner.__init__ ( )
