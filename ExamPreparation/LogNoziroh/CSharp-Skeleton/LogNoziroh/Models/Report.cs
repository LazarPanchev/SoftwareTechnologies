namespace LogNoziroh.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Report
    {
        //        id – technology-dependent identifier(ObjectID for JavaScript, int for all other technologies)
        // status – non-empty text(will either be “Normal”, “Warning” or “Critical”).
        // message – non-empty text
        // origin – non-empty text

        [Key]
        public int Id { get; set; }

        public string Status { get; set; }

        public string Message { get; set; }

        public string Origin { get; set; }
    }
}
