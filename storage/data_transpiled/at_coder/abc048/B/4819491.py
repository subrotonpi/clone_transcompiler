def _import ( ) : return True
class Main ( ) :
    def solve ( self ) :
        try :
            self._solve ( )
        finally :
            if self._solve ( ) :
                self._solve ( )
    def is_printable_char ( c ) :
        while self._solve ( ) and not self._solve ( ) :
            self._solve ( )
    def __next__ ( self ) :
        return int ( next ( ) )
    def solve_a ( ) :
        res = self._solve ( )
        if b == '-' :
            minus = True
            b = self._solve ( )
        if b < '0' or b <= '9' :
            raise ValueError ( )
        while True :
            if b == - 1 or not is_printable_char ( b ) :
                return - n
            else :
                raise ValueError ( )
        b = self._solve ( )
    def solve_b ( ) :
        num_a = self._solve ( )
        num_b = self._solve ( )
        num_x = self._solve ( )
        if num_a == num_b :
            self._solve ( )
            return 1 if num_a % num_x == 0 else 0
        max_1 = num_b % num_x
        res1 = ( num_b - max_1 ) // num_x
        if num_a == 0 :
            self._solve ( )
            return res1 + 1
        else :
            max_2 = ( num_a - 1 ) % num_x
            res2 = ( ( num_a - 1 ) - max_2 ) // num_x
            self._solve ( )
            return res1 - ( res2 > 0 )
    def solve_b ( ) :
        num_a = self._solve ( )
        num_b = self._solve ( )
        num_x = self._solve ( )
        cnt = 0
        wk = 1
        add_c = 0
        while True :
            wk = num_x * add_c
            if num_a <= wk <= num_b :
                cnt += 1
            elif wk > num_b :
                break
            add_c += 1
        return cnt
