def import datetime
import sys
class Main ( object ) :
    def find_date ( self ) :
        year = datetime.datetime.year
        month = datetime.datetime.month + 1
        day = datetime.datetime.day
        if year % month == 0 and year / month % day == 0 : return True
        else : return False
    def main ( self ) :
        with open ( self.filename ) as f :
            date = f.read ( ).split ( '/' , 1 )
            year , month , day = [ int ( i ) for i in date [ : 3 ] ]
    def find_date ( self ) :
        while not ( find_date ( self ) ) :
            self.date += datetime.timedelta ( 1 )
        year , month , day = self.date.split ( '/' , 1 )
        sys.stdout.write ( "%4d/%02d/%02d\n" % ( year , month , day ) )
