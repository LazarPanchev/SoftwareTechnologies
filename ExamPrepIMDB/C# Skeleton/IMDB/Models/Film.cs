namespace IMDB.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Film
    {
         //        Data Model
         //The Film entity holds 5 properties:
         // id – technology-dependent identifier(ObjectID for JavaScript, int for all other technologies)
         // name – non-empty text
         // genre – non-empty text
         // director – non-empty text
         // year – non-null integer

        [Key]
        public int Id { get; set; }

        [Required]
        public string Name { get; set; }

        [Required]
        public string Genre{ get; set; }

        [Required]
        public string Director { get; set; }

        [Required]
        public int Year { get; set; }
    }
}
