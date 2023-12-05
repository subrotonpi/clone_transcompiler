def import import input_reader , input_writer , input_reader , input_writer , input_writer , output_writer , solver , solver , ) :
    input_file = input_reader ( input_reader )
    output_file = input_writer ( output_file )
    solver.solve ( input_file , output_file )
    output_file.close ( )
class Task :
    def solve ( self , input_reader , output_writer ) :
        N = input_reader.randint ( 1 , N )
        R = [ input_writer ( ) for _ in range ( N ) ]
        R.sort ( reverse = True )
        ans = 0
        sign = 1
        for r in R :
            ans += sign * r ** 2
            sign *= - 1
        output_writer ( ans * math.pi )
class input_writer ( input_reader ) :
    def readline ( self ) :
        stream = input_reader ( )
        stream.readline ( )
        stream.readline ( )
        stream.readline ( )
        while not stream or not stream.readline ( ) :
            try :
                stream.readline ( )
            except EOFError :
                stream.readline ( )
                stream.readline ( )
                stream.readline ( )
        return stream.readline ( )
    def readline ( self ) :
        return int ( self.readline ( ) )
