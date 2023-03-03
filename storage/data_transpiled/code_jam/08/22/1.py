def _import ( ) :
    import random
    import os
    class NumberFast ( object ) :
        def __init__ ( self ) :
            self.problemID = __name__ + "_small"
            self.stdin = open ( self.problemID + ".in" , "r" )
            self.stdout = open ( self.problemID + ".out" , "w" )
            self.a , self.b , self.p = int ( self.problemID ) , int ( self.problemID ) , int ( self.problemID )
            self.parent [ self.u ] = self.result
            return self.result
        def get ( self ) :
            if self.u == self.parent [ self.u ] :
                return self.u
            result = self.get ( self.parent [ self.u ] )
            self.parent [ self.u ] = result
            return result
        def merge ( self , u , v ) :
            u , v = self.get ( u ) , int ( self.problemID )
            if u == v :
                return self.result
            self.merges += 1
            if rnd.random ( ) < self.predecessor :
                self.parent [ u ] = v
            else :
                self.parent [ v ] = u
        def merge_sets ( self , q ) :
            if q < self.p :
                return self.result
            first = self.a - ( self.a % q )
            if first < self.a :
                first = first + self.q
            cur = first + self.q
            while cur <= self.b :
                self.merge ( int ( first - self.a ) , int ( cur - self.a ) )
                cur = cur + self.q
        def solve_single_test ( self , test_number ) :
            with open ( self.problemID + ".in" , "r" ) as f :
                a , b , p = f.read ( ) , self.b , self.p
    def solve ( ) :
        return NumberFast ( )
    a , b , p = random.randrange ( 1 , 2 ) , random.randrange ( 1 , 2 )
    numbers = [ ]
    for i in range ( len ( numbers ) ) :
    