def _import ( ) :
    from os import path
    import sys
    class Triangles ( object ) :
        def __init__ ( self ) :
            self.problemID = __name__
            self.problemType = "small"
            self.stdin = open ( path.join ( self.problemID , "_" + self.problemType + ".in" ) , 'r' )
            self.stdout = open ( path.join ( self.problemID , "_" + self.problemType + ".out" ) , 'w' )
            self.last_x , self.last_y = 0 , 0
        def is_good ( self , a , n , m ) :
            for i in range ( 1 , n + 1 ) :
                num = a // i
                if num > m :
                    continue
                if a - num * i != 0 :
                    continue
                self.last_x , self.last_y = i , num
                return True
            return False
        def small_case_solver ( self , test_number , n , m , a ) :
            for x in range ( 0 , n + 1 ) :
                for y in range ( 0 , m + 1 ) :
                    num = a + x * y
                    if self.is_good ( num , n , m ) :
                        self.stdout.write ( "Case #%d: 0 0 %d %d %d %d\n" % ( self.test_number , self.last_x , self.y , x , self.last_y ) )
                        return
            self.stdout.write ( "Case #%d: IMPOSSIBLE\n" % self.test_number )
        def solve_single_test ( self , test_number ) :
            self.stdout.write ( "Case #%d: IMPOSSIBLE\n" % self.test_number )
            self.stdout.write ( "Case #%d: IMPOSSIBLE\n" % self.test_number )
        def solve ( self ) :
            self.stdout.write ( "Case #%d: IMPOSSIBLE\n" % self.test_number )
    return Triangles ( )
