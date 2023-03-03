def import _rotate
class C ( object ) :
    def __init__ ( self , front ) :
        self.front = front
    def rotate ( self , f ) :
        return ( f / 10 ) + self.front * ( f % 10 )
    def main ( self ) :
        with open ( 'input.txt' , 'r' ) as f :
            T = f.read ( )
    for c in range ( 1 , T + 1 ) :
        ans = 0
        A = A.read ( )
        B = B.read ( )
        ndig = len ( ( '%d' % A ) )
        front = 1
        for i in range ( 1 , ndig ) :
            front *= 10
        for num in range ( A , B + 1 ) :
            count = 1
            rot = rotate ( num )
            smallest = True
            while smallest and rot != num :
                if A <= rot <= B :
                    if rot < num :
                        smallest = False
                    else :
                        count += 1
                    rot = rotate ( rot )
            if smallest :
                ans += count * ( count - 1 ) / 2
        print ( 'Case #%d: %d' % ( c , ans ) )
