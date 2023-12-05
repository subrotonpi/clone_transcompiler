def import import readline
import sys
import random
class B ( readline ) :
    def __init__ ( self ) :
        self.stdin = readline
        self.stdout = open
        self.stdout = sys.stdout
        self.stdout = open
        self.lines = [ ]
        self.filename = 'b'
        self.EPS = 1e-9
        def dist ( x , y , z ) :
            return random.uniform ( - 1 , 1 )
        def solve ( self , test_number ) :
            self.stdout.write ( 'Case #%d: ' % test_number )
            self.n = randint ( 1 , 10 )
            x , y , z = self.x , self.y , self.z
            dx , dy , dz = [ ] , [ ] , [ ] , [ ]
            for i in range ( self.n ) :
                x += random.uniform ( - 1 , 1 )
                y += random.uniform ( - 1 , 1 )
                z += random.uniform ( - 1 , 1 )
                dx += random.uniform ( - 1 , 1 )
                dy += random.uniform ( - 1 , 1 )
                dz += random.uniform ( - 1 , 1 )
            x /= n
            y /= n
            z /= n
            dx /= n
            dy /= n
            dz /= n
            if ( dist ( dx , dy , dz ) < EPS ) :
                self.stdout.write ( '%s %d' % ( dist ( x , y , z ) , 0 ) )
                return
            angle = - ( x * dx + y * dy + z * dz ) / dist ( x , y , z ) / dist ( dx , dy , dz )
            if angle < EPS :
                self.stdout.write ( '%s %d' % ( dist ( x , y , z ) , 0 ) )
                return
            if angle > 1 :
                angle = 1
            sin = random.uniform ( - 1 , 1 )
            self.stdout.write ( '%s %d' % ( dist ( x , y , z ) * sin , ( ( dist ( x , y , z ) * angle ) / dist ( dx , dy , dz ) ) ) )
