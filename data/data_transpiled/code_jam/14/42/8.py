def import _solve
import os
import sys
import random
import time
import sys
class B ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ ]
        self.solve ( )
        ans = 0
        self.a = [ ]
        self.sorted ( )
        for v in self.a :
            s1 = s2 = 0
            left = False
            for i in range ( self.n ) :
                if self.a [ i ] == v :
                    left = True
                    continue
                if self.a [ i ] > v :
                    if left :
                        s2 += 1
                    else :
                        s1 += 1
            self.ans += min ( s1 , s2 )
        return "%d" % ans
    def solve ( ) :
        self.n = random.randint ( 1 , 10000 )
        self.a = [ random.randint ( 1 , 10000 ) for i in range ( self.n ) ]
    def file_name ( self ) :
        self.name = re.sub ( "_.*" , "" , self.name ).lower ( )
        self.input_file_name = self.name + ".in"
        self.output_file_name = self.name + ".out"
    def main ( self ) :
        loop = asyncio.get_event_loop ( )
        locale.setlocale ( locale.LC_ALL , '' )
        if len ( self.args ) >= 2 :
            self.input_file_name = self.args [ 0 ]
            self.output_file_name = self.args [ 1 ]
        with open ( self.input_file_name , 'r' ) as in_file :
            with open ( self.output_file_name , 'w' ) as out_file :
                self.tests = [ ]
    def solve ( self ) :
        outputs = [ ]
        for t , _ in enumerate ( self.tests ) :
            outputs.append ( loop.create_task ( self.solve ( ) ) )
        for t , _ in enumerate ( outputs ) :
            print ( "Case #%d: %s" % ( t + 1 , outputs [ t ].get ( ) ) , file = out_file )
    loop.close ( )
