def _ ( ) : return ''
import random , random
class C ( object ) :
    PROBLEM = 'C'
    TEST = 'large'
    def solve ( self ) :
        a1 = randint ( 0 , a1 )
        a2 = randint ( 0 , a2 )
        z1 = randint ( 0 , z1 )
        z2 = randint ( 0 , z2 )
        cnt = 0
        phi = ( random.randrange ( 5.0 , 1 ) - 1 ) ** 0.5
        for i in range ( a1 , a2 + 1 ) :
            b = int ( round ( i * phi ) )
            b1 = max ( 1 , b - 3 )
            b2 = max ( 1 , b + 3 )
            first0 = self._res ( i , b1 , b2 , False )
            b = int ( round ( i / phi ) )
            b1 = max ( 1 , b - 3 )
            b2 = max ( 1 , b + 3 )
            last0 = self._res ( i , b1 , b2 , True ) - 1
            right = min ( first0 , z2 + 1 )
            if z1 < right :
                cnt += right - z1
            left = max ( z1 - 1 , last0 )
            if last0 < z2 :
                cnt += z2 - left
        return '' , cnt
    def _res ( self , i , b1 , b2 , target ) :
        was_not = self.i == 1
        for j in range ( b1 , b2 + 1 ) :
            x = i
            y = j
            win = True
            while x < 2 ** y and y < 2 ** x :
                if x > y :
                    x -= y
                else :
                    y -= x
                win = not win
            was_not |= win != target
            if win == target and was_not :
                return j
        raise
    def readline ( self ) :
        self.stdout = open ( '%s-%s.in' % ( PROBLEM , self.TEST ) , 'r' )
        self.stdout.write ( '\n' )
        self.stdout.close ( )
    def readline ( self ) :
        self.stdout = open ( '%s-%s.in' % ( PROBLEM , self.TEST ) , 'r' )
        self.stdout.close ( )
