def import import math
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = '? %d' % ( long ( 1e10 ) )
        s = self.raw_input ( )
        if s == 'Y' :
            cnt = 0
            while True :
                print ( '? %d' % ( long ( 2 * math.pow ( 10 , cnt ) ) ) )
                s = self.raw_input ( )
                if s == 'Y' :
                    print ( '! %d' % ( long ( math.pow ( 10 , cnt ) ) ) )
                    return
                cnt += 1
        else :
            cnt = 9
            while True :
                print ( '? %d' % ( long ( math.pow ( 10 , cnt ) ) ) )
                s = self.raw_input ( )
                if s == 'Y' :
                    break
                cnt -= 1
            left = long ( math.pow ( 10 , cnt ) )
            right = long ( math.pow ( 10 , cnt + 1 ) ) - 1
            while right - left > 1 :
                middle = ( right + left ) / 2
                print ( '? %d' % ( middle * 10 ) )
                s = self.raw_input ( )
                if s == 'Y' :
                    right = middle
                else :
                    left = middle
            print ( '! %d' % right )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
