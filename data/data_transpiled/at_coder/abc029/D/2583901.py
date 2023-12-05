def _ ( ) : return int ( next_string ( ) )
def rand ( n ) : return float ( next_string ( ) )
def rand ( n ) : return [ randint ( 0 , n ) for i in range ( n ) ]
def main ( ) :
    input_file = sys.stdin
    output_file = sys.stdout
    inp = input_stream ( input_file )
    output_file = output_file
    solver = TaskX ( )
    solver.solve ( 1 , inp , output_file )
    output_file.close ( )
INF = 1 << 30
MOD = 1000000007
mh4 = [ 0 , - 1 , 1 , 0 ]
mw4 = [ - 1 , 0 , 0 , 1 , 1 , 1 ]
mh8 = [ - 1 , - 1 , - 1 , 0 , 0 , 1 , 1 ]
class TaskX ( ) :
    def solve ( self , test_number , inp , output_file ) :
        n = inp ( )
        keta = len ( str ( n ) )
        ans = 0
        for k in range ( 1 , keta + 1 ) :
            ans += ( n / int ( pow ( 10 , k ) ) * int ( pow ( 10 , k - 1 ) ) )
            mod = int ( n % pow ( 10 , k ) ) + 1
            if mod <= int ( pow ( 10 , k - 1 ) ) :
                ans += 0
            elif int ( pow ( 10 , k - 1 ) ) < mod <= 2 * int ( pow ( 10 , k - 1 ) ) :
                ans += mod - int ( pow ( 10 , k - 1 ) )
            elif 2 * int ( pow ( 10 , k - 1 ) ) < mod :
                ans += int ( pow ( 10 , k - 1 ) )
        output_file.write ( ans )
