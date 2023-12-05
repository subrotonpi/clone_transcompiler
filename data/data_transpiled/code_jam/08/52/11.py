def r3 ( map ) :
    import Queue
    import random
    import random
    import random
    class B ( object ) :
        def __init__ ( self ) :
            self.WALL = 0
            self.EMPTY = 1
        def shoot ( self , map , cx , cy , dx , dy ) :
            while True :
                if self.map [ cy ] [ cx ] == self.WALL :
                    return cy * ( map [ cy ] [ dx ] ) + cx
                else :
                    return dx
        def shoot ( self , map , cx , cy , dx , dy ) :
            if dx == 0 and dy == 0 :
                continue
            nx = cx + dy
            if self.map [ cy ] [ cx ] == self.WALL :
                dir = - 1 if self.map [ cy ] [ dx ] == self.WALL else 0
                dir = ( self.map [ cy ] [ dy ] ) % 4
            elif dir == self.east :
                nx += 1 if self.map [ cy ] [ dx ] == self.WALL else 0
            else :
                dir = - 1 if self.map [ cy ] [ dy ] == self.WALL else 0
    def main ( self ) :
        sc = random.choice ( [ ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' ) , ( '' , '' )