def _import ( ) : return int ( next ( ) )
def solve ( ) : return long ( next ( ) )
def uniform ( ) : return float ( next ( ) )
def solve ( ) :
    N = randint ( 0 , N )
    a = [ randint ( 0 , N ) for _ in range ( N ) ]
    ans = sum ( ans )
    def sum ( ) :
        cnt = 0
        for i in range ( N ) :
            sum += a [ i ]
            if i % 2 == 0 :
                if sum <= 0 :
                    cnt += 1 - sum
                    sum = 1
            else :
                if sum >= 0 :
                    cnt += 1 + sum
                    sum = - 1
        ans = min ( ans , cnt )
    def solve ( ) :
        sum = 0
        cnt = 0
        for i in range ( N ) :
            sum += a [ i ]
            if i % 2 == 1 :
                if sum <= 0 :
                    cnt += 1 - sum
                    sum = 1
            else :
                if sum >= 0 :
                    cnt += 1 + sum
                    sum = - 1
        ans = min ( ans , cnt )
    out.write ( ans )
def main ( ) :
    out.flush ( )
    with open ( '/dev/null' , 'w' ) as f :
        data = f.read ( 2048 )
    p = 0
    buflen = 0
    def has_next_byte ( ) :
        if p < buflen : return True
        p = 0
        try :
            buflen = len ( data )
        except TypeError :
            pass
        if buflen <= 0 : return False
        return True
    def next_byte ( ) :
        while has_next_byte ( ) and not is_print ( data [ p ] ) :
            p += 1
        return data [ p ]
    def is_print ( ) :
        while has_next_byte ( ) and not is_print ( data [ p ] ) :
            p += 1
        return False
    return True
