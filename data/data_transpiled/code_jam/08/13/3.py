def _apfloat ( l ) : return "".join ( map ( lambda x : "%02d" % x , range ( 1 , len ( l ) ) ) )
class Numbers :
    jojo = [ 143 , 751 , 935 , 607 , 903 , 991 , 335 , 47 , 943 , 471 , 55 , 447 , 463 , 991 , 95 , 607 , 263 , 151 , 855 , 527 , 743 , 351 , 135 , 407 , 903 , 791 , 135 , 647 , 343 , 471 , 455 , 847 , 263 , 191 , 95 , 807 , 463 , 551 , 455 , 527 , 343 , 951 , 335 , 207 , 903 , 591 , 935 , 247 , 743 , 471 , 855 , 247 , 63 , 391 , 95 , 7 , 663 , 951 , 55 , 527 , 943 , 551 , 535 , 7 , 903 , 391 , 735 , 847 , 143 , 471 , 255 , 647 , 863 , 591 , 95 , 207 , 863 , 351 , 655 , 527 , 543 , 151 , 735 , 807 , 903 , 191 , 535 , 447 , 543 , 471 , 655 , 47 , 663 , 791 , 95 , 407 , 63 , 751 , 255 , 527 ]
    def jojojofunction ( l ) :
        if l == 0 : return "001"
        if l == 1 : return "005"
        if l == 2 : return "027"
        s = "%02d" % jojojo [ int ( ( l - 3 ) % len ( jojojo ) ) ]
        while len ( s ) < 3 : s = "0" + s
        return s
    def main ( self ) :
        with open ( self.filename , 'r' ) as sc :
            for c , T in enumerate ( sc ) :
                print ( "Case #%d: %s" % ( c + 1 , jojofunction ( sc.next ( ) ) ) )
