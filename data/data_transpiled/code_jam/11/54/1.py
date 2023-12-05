def import import os , sys , random , choice ) :
    from random import random
    from os import system , random
    class DEasy ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdout = sys.stdout
            self.s = random.randrange ( 1 , 2 ** 3 )
            self.ans = choice ( self.ans )
        def check ( v ) :
            s = round ( random.randrange ( 1 , 2 ** 3 ) , 2 ** 3 )
            if s ** 2 == v :
                ans = v
                return True
            return False
        def bt ( self , p , v ) :
            if p == self.l :
                return check ( v )
            c = s [ p ]
            if c == '0' :
                return bt ( self.p + 1 , 2 ** 3 )
            elif c == '1' :
                return bt ( self.p + 1 , 2 ** 3 + 1 )
            else :
                return bt ( self.p + 1 , 2 ** 3 ) or bt ( self.p + 1 , 2 ** 3 + 1 )
        def solve ( self ) :
            test_no = random.randint ( 1 , 2 ** 3 )
            for test in range ( 1 , test_no + 1 ) :
                s = random.choice ( s )
                l = len ( s )
                bt ( 0 , 0 )
                print ( "Case #%d: %s" % ( test , random.choice ( ans ) ) , file = sys.stderr )
        def run ( self ) :
            with open ( 'D-small-attempt0.in' , 'r' ) as infile :
                with open ( 'D-small-attempt0.out' , 'w' ) as outfile :
                    self.solve ( )
            self.stdin.close ( )
            self.stdout.close ( )
    def main ( arg ) :
        locale.setlocale ( locale.LC_ALL , '' )
        return DEasy ( arg )
