def import Color , R , B , G
class Main ( object ) :
    class Enum ( Color ) :
        R = R
        B = B
        G = G
        def __init__ ( self , string ) :
            self.name = string
        def to_enum ( self , string ) :
            self.name = string
        def to_enum ( self , string ) :
            if string == R.name :
                return R
            elif string == B.name :
                return B
            else :
                return G
    def main ( ) :
        Scanner = Scanner ( )
        ( N , S ) = Scanner.scan ( )
        deque = deque ( )
        S = S.split ( "" )
        for i in range ( N ) :
            ball = Color.to_enum ( S [ i ] )
            if len ( deque ) == 0 :
                deque.append ( ball )
                continue
            if len ( deque ) == 1 :
                ball1 = deque.pop ( )
                if ball1 == ball :
                    deque.popleft ( )
                else :
                    deque.append ( ball )
                continue
            ball1 = deque.pop ( )
            ball2 = deque.pop ( )
            if ball == ball1 :
                deque.popleft ( )
                continue
            if ball == ball2 :
                deque.popleft ( )
                continue
            if i == N - 1 :
                deque.append ( ball )
                continue
            next_ball = Color.to_enum ( S [ i + 1 ] )
            if ball == next_ball :
                deque.append ( ball )
                continue
            if ball1 == next_ball :
                deque.append ( ball )
            elif ball2 == next_ball :
                deque.append ( ball )
        print ( len ( deque ) )
