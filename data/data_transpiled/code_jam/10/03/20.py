def code10.qualification ( R , k , n , g ) :
    import os
    import os
    import sys
    import os
    import sys
    import os
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.money = 0
            self.old_index = 0
            self.index = 0
            self.g_sum = 0
            temp = 0
            for i in range ( R ) :
                self.g_sum = 0
                old_index = self.index
                while True :
                    temp = self.g_sum + self.g [ self.index ]
                    if temp <= k :
                        self.g_sum = temp
                        self.index += 1
                        if self.index >= len ( self.g ) :
                            self.index = 0
                        if self.index == old_index :
                            break
                    else :
                        break
            self.money += self.g_sum
        def main ( self ) :
            fname = "C-large"
            input_file = fname + ".in"
            output_file = fname + ".out"
            reader = open ( input_file , "r" )
            output_file = open ( output_file , "w" )
            input_line = [ ]
            for c in reader :
                input_line.append ( c )
            self.total_case = int ( "".join ( input_line ) )
            for case_index in range ( 1 , self.total_case + 1 ) :
                input_line = [ ]
                while True :
                    input_line.append ( c )
                self.input_part = input_line.split ( )
                R = int ( self.input_part [ 0 ] )
                k = int ( self.input_part [ 1 ] )
                N = int ( self.input_part [ 2 ] )
                g = [ ]
                input_line = [ ]
                for c in reader :
                    input_line.append ( c )
                self.input_part = input_line.split ( )
                for i in range ( self.n ) :
                    g [ i ] = int ( self.input_part [ i ] )
            output = "Case #" + str ( case_index ) + ": " + str ( solve ( R , k , N , g ) )
            print ( output , file = output_file )
    