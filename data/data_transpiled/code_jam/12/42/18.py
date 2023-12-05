def codejam.y2012.r2 ( ) :
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    class Task2 :
        def __init__ ( self ) :
            self.x = 0
            self.y = 0
            self.rad = 0
            self.student = 0
        def intersect ( self , other ) :
            deltax = abs ( self.x - other.x )
            deltay = abs ( self.y - other.y )
            distance = math.sqrt ( deltax ** 2 + deltay ** 2 )
            return distance < ( self.rad + other.rad )
        def get ( self ) :
            return self.student - self.student
    def main ( ) :
        input = open ( "D:/Programming/Projects/CodeJam/input.txt" , "r" )
        output = open ( "D:/Programming/Projects/CodeJam/output.txt" , "w" )
        T = input.read ( )
        for i in range ( 1 , T + 1 ) :
            result = get_result ( )
            print ( "Case #{}: {}".format ( i , result ) )
            output.write ( "Case #{}: {}".format ( i , result ) )
            output.write ( "\n" )
        output.close ( )
    def get_result ( ) :
        N , W , L = input.read ( ).split ( "\n" )
        r = [ ]
        for i in range ( N ) :
            r.append ( input.read ( ) )
        c = 0
        circles = list ( )
        i = 0
        for i in range ( W ) :
            for j in range ( L ) :
                circle = { }
                circle [ "x" ] = i
                circle [ "y" ] = j
                circle [ "rad" ] = r [ c ]
                circle [ "student" ] = c
                for other_circle in circles :
                    if circle.intersect ( other_circle ) :
                        delta = int ( other_circle [ "rad" ] ) / 4
                        if delta == 0 :
                            delta = 1
                        elif i + delta < W :
                            i += delta
                circles