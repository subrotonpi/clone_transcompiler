def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            amida = Amida ( )
            amida.start_amida ( )
            amida.print_hit_line ( )
    class Amida ( object ) :
        def __init__ ( self ) :
            self.amida = [ ]
            self.current_index = 0
            self.line_count = 1
            self.row_count = 1
            self.amida = [ ]
            tmp_arr = [ ]
            for i in range ( self.row_count - 1 , - 1 , - 1 ) :
                tmp_arr.append ( sc.readline ( ) )
            for i in range ( self.row_count ) :
                char_arr = tmp_arr [ i ].split ( )
                for j in range ( self.line_count ) :
                    self.amida [ i ].append ( str ( char_arr [ j ] ) )
            current_point = sc.readline ( )
            curr_arr = current_point.split ( )
            for i in range ( len ( curr_arr ) ) :
                if curr_arr [ i ] == 'o'.split ( ) [ 0 ] :
                    self.current_index = i
        def start_amida ( self ) :
            for i in range ( self.row_count ) :
                if current_index < self.line_count - 1 and amida [ i ] [ current_index + 1 ].lower ( ) == '-' :
                    current_index += 2
                elif current_index > 0 and amida [ i ] [ current_index - 1 ].lower ( ) == '-' :
                    current_index -= 2
        def print_hit_line ( self ) :
            ans = self.current_index / 2 + 1
            print ( ans )
