def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.po = __main__.__doc__
        self.n = self.n
        count = 0
        x , y = 0 , 0
        s = po.split ( '' , 1 )
        for i in s :
            if i == 'U' :
                y -= 1
            elif i == 'D' :
                y += 1
            elif i == 'R' :
                x += 1
            elif i == 'L' :
                x -= 1
            else :
                count += 1
        h = abs ( x ) + abs ( y )
        print ( ( h + count ) if n == 1 else ( h < count ) and ( ( h - count ) % 2 == 0 ) )
