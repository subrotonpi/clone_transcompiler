def import import _solve
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve ( )
    def solve ( self ) :
        with open ( self.path ) as f :
            N = f.readline ( )
            A = f.readline ( )
            B = f.readline ( )
            C = f.readline ( )
            list = [ ]
            for index in range ( N ) :
                list.append ( f.readline ( ) )
            imihu = int ( math.pow ( 10 , 9 ) )
            answer = calculate ( 0 , 0 , 0 , 0 )
            print ( answer )
    def calculate ( self , now_take , a_take , b_take , c_take ) :
        if now_take == self.N :
            min = a_take
        else :
            min = b_take
        if min > c_take :
            min = c_take
        if min > 0 :
            return abs ( A - a_take ) + abs ( B - b_take ) + abs ( C - c_take ) - 30
        else :
            return imihu
    first , second , third , fourth = calculate ( self.N + 1 , a_take , b_take , c_take )
    min = first
    if min > second :
        min = second
    if min > third :
        min = third
    if min > fourth :
        min = fourth
    return min
