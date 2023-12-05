def import readline , sys , maxsize , filename
class Solution ( object ) :
    def __init__ ( self ) :
        self.tokens = sys.stdin.readline ( )
        self.stdin = open ( filename + ".in" , 'w' )
        self.stdout = open ( filename + "B-large" , 'w' )
    def solve ( self , test ) :
        self.stdout.write ( "Case #%d: " % test )
        self.stdout.write ( "\n" )
        self.stdout.write ( "\n" )
    def readline ( self ) :
        return int ( self.stdout.readline ( ) )
    def eval ( self , locals ( ) ) :
        self.stdout.write ( "\n" )
    def main ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        threading.Thread ( target = eval ).start ( )
    def run ( self ) :
        self.stdout.write ( "\n" )
    def run ( self ) :
        while not self.stdout.readline ( ) :
            self.stdout.write ( "\n" )
        self.stdout.readline ( )
    def eat ( self ) :
        s = [ ]
        count = [ 0 ] * 10
        max = - 1
        i = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            count [ s [ i ] - '0' ] += 1
            if max > s [ i ] - '0' :
                max = s [ i ] - '0' + 1
                while count [ max ] == 0 :
                    max += 1
                s.append ( ord ( '0' ) + max )
                count [ max ] -= 1
                for j , t in enumerate ( range ( i + 1 , t ) ) :
                    while count [ t ] > 0 :
                        s.append ( ord ( '0' ) + t )
                        count [ t ] -= 1
                break
            else :
                max = s [ i ] - '0'
        if self.stdout.readline ( ) == '' :
            s = [ ]
            count = [ 0 ] * 100000
            min = 1
            while not self.stdout.readline ( ) :
                count [ min ] = min
    return Solution
    